package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Datev: ImageVector
    get() {
        if (_datev != null) {
            return _datev!!
        }
        _datev = ImageVector.Builder(
            name = "Datev",
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
        moveTo(1.25f, 14.5f)
        verticalLineTo(9.5f)
        horizontalLineTo(2.25f)
        curveTo(3.63071f, 9.5f, 4.75f, 10.6193f, 4.75f, 12f)
        curveTo(4.75f, 13.3807f, 3.63071f, 14.5f, 2.25f, 14.5f)
        horizontalLineTo(1.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.75f, 14.5f)
        lineTo(7.75f, 9.5f)
        lineTo(9.75f, 14.5f)
        horizontalLineTo(8.03571f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.75f, 9.5f)
        lineTo(20.75f, 14.5f)
        lineTo(22.75f, 9.5f)
        horizontalLineTo(21.0357f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.25f, 9.5f)
        horizontalLineTo(11.75f)
        moveTo(13.25f, 9.5f)
        horizontalLineTo(11.75f)
        moveTo(11.75f, 9.5f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.25f, 14.5f)
        horizontalLineTo(14.75f)
        verticalLineTo(12f)
        moveTo(17.25f, 9.5f)
        horizontalLineTo(14.75f)
        verticalLineTo(12f)
        moveTo(14.75f, 12f)
        horizontalLineTo(17.25f)
        }
        }.build()

        return _datev!!
    }

private var _datev: ImageVector? = null
