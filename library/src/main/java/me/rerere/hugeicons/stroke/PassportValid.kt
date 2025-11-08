package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PassportValid: ImageVector
    get() {
        if (_passportValid != null) {
            return _passportValid!!
        }
        _passportValid = ImageVector.Builder(
            name = "PassportValid",
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
        moveTo(12f, 3.5f)
        curveTo(7.28595f, 3.5f, 4.92893f, 3.5f, 3.46447f, 4.81802f)
        curveTo(2f, 6.13604f, 2f, 8.25736f, 2f, 12.5f)
        curveTo(2f, 16.7426f, 2f, 18.864f, 3.46447f, 20.182f)
        curveTo(4.92893f, 21.5f, 7.28595f, 21.5f, 12f, 21.5f)
        curveTo(16.714f, 21.5f, 19.0711f, 21.5f, 20.5355f, 20.182f)
        curveTo(22f, 18.864f, 22f, 16.7426f, 22f, 12.5f)
        curveTo(22f, 11.3538f, 22f, 8.5f, 22f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 17f)
        curveTo(6.20831f, 14.4189f, 10.7122f, 14.2491f, 12f, 17f)
        moveTo(10.5f, 10f)
        curveTo(10.5f, 11.1046f, 9.60457f, 12f, 8.5f, 12f)
        curveTo(7.39543f, 12f, 6.5f, 11.1046f, 6.5f, 10f)
        curveTo(6.5f, 8.89543f, 7.39543f, 8f, 8.5f, 8f)
        curveTo(9.60457f, 8f, 10.5f, 8.89543f, 10.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 6.5f)
        curveTo(14f, 6.5f, 15f, 6.5f, 16f, 8.5f)
        curveTo(16f, 8.5f, 19.1765f, 3.5f, 22f, 2.5f)
        }
        }.build()

        return _passportValid!!
    }

private var _passportValid: ImageVector? = null
