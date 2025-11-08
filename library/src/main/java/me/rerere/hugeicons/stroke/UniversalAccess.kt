package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UniversalAccess: ImageVector
    get() {
        if (_universalAccess != null) {
            return _universalAccess!!
        }
        _universalAccess = ImageVector.Builder(
            name = "UniversalAccess",
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
        moveTo(12f, 6.5f)
        curveTo(12.8284f, 6.5f, 13.5f, 5.82843f, 13.5f, 5f)
        curveTo(13.5f, 4.17157f, 12.8284f, 3.5f, 12f, 3.5f)
        curveTo(11.1716f, 3.5f, 10.5f, 4.17157f, 10.5f, 5f)
        curveTo(10.5f, 5.82843f, 11.1716f, 6.5f, 12f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 7f)
        curveTo(16.4537f, 8.23719f, 14.336f, 9f, 12f, 9f)
        curveTo(9.66404f, 9f, 7.54628f, 8.23719f, 6f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 14.5f)
        lineTo(14.5f, 20.5f)
        moveTo(13.5f, 14.5f)
        verticalLineTo(9f)
        moveTo(13.5f, 14.5f)
        horizontalLineTo(10.5f)
        moveTo(9.5f, 20.5f)
        lineTo(10.5f, 14.5f)
        moveTo(10.5f, 14.5f)
        verticalLineTo(9f)
        }
        }.build()

        return _universalAccess!!
    }

private var _universalAccess: ImageVector? = null
