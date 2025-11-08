package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = ImageVector.Builder(
            name = "Passport",
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
        moveTo(2f, 12f)
        curveTo(2f, 7.75736f, 2f, 5.63604f, 3.46447f, 4.31802f)
        curveTo(4.92893f, 3f, 7.28596f, 3f, 12f, 3f)
        curveTo(16.714f, 3f, 19.0711f, 3f, 20.5355f, 4.31802f)
        curveTo(22f, 5.63604f, 22f, 7.75736f, 22f, 12f)
        curveTo(22f, 16.2426f, 22f, 18.364f, 20.5355f, 19.682f)
        curveTo(19.0711f, 21f, 16.714f, 21f, 12f, 21f)
        curveTo(7.28596f, 21f, 4.92893f, 21f, 3.46447f, 19.682f)
        curveTo(2f, 18.364f, 2f, 16.2426f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 16.5f)
        curveTo(6.20831f, 13.9189f, 10.7122f, 13.7491f, 12f, 16.5f)
        moveTo(10.5f, 9.5f)
        curveTo(10.5f, 10.6046f, 9.60457f, 11.5f, 8.5f, 11.5f)
        curveTo(7.39543f, 11.5f, 6.5f, 10.6046f, 6.5f, 9.5f)
        curveTo(6.5f, 8.39543f, 7.39543f, 7.5f, 8.5f, 7.5f)
        curveTo(9.60457f, 7.5f, 10.5f, 8.39543f, 10.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 10f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        horizontalLineTo(19f)
        }
        }.build()

        return _passport!!
    }

private var _passport: ImageVector? = null
