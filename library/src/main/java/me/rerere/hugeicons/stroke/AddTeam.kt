package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AddTeam: ImageVector
    get() {
        if (_addTeam != null) {
            return _addTeam!!
        }
        _addTeam = ImageVector.Builder(
            name = "AddTeam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7.5f)
        curveTo(12f, 9.433f, 10.433f, 11f, 8.5f, 11f)
        curveTo(6.567f, 11f, 5f, 9.433f, 5f, 7.5f)
        curveTo(5f, 5.567f, 6.567f, 4f, 8.5f, 4f)
        curveTo(10.433f, 4f, 12f, 5.567f, 12f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 11f)
        curveTo(15.433f, 11f, 17f, 9.433f, 17f, 7.5f)
        curveTo(17f, 5.567f, 15.433f, 4f, 13.5f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.1429f, 20f)
        horizontalLineTo(3.85714f)
        curveTo(2.83147f, 20f, 2f, 19.2325f, 2f, 18.2857f)
        curveTo(2f, 15.9188f, 4.07868f, 14f, 6.64286f, 14f)
        horizontalLineTo(10.3571f)
        curveTo(11.4023f, 14f, 12.3669f, 14.3188f, 13.1429f, 14.8568f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 14f)
        verticalLineTo(20f)
        moveTo(22f, 17f)
        lineTo(16f, 17f)
        }
        }.build()

        return _addTeam!!
    }

private var _addTeam: ImageVector? = null
