package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Location09: ImageVector
    get() {
        if (_location09 != null) {
            return _location09!!
        }
        _location09 = ImageVector.Builder(
            name = "Location09",
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
        moveTo(18f, 18f)
        curveTo(19.2447f, 18.4244f, 20f, 18.9819f, 20f, 19.5925f)
        curveTo(20f, 20.9221f, 16.4183f, 22f, 12f, 22f)
        curveTo(7.58172f, 22f, 4f, 20.9221f, 4f, 19.5925f)
        curveTo(4f, 18.9819f, 4.75527f, 18.4244f, 6f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9.5f)
        curveTo(15f, 11.1569f, 13.6569f, 12.5f, 12f, 12.5f)
        curveTo(10.3431f, 12.5f, 9f, 11.1569f, 9f, 9.5f)
        curveTo(9f, 7.84315f, 10.3431f, 6.5f, 12f, 6.5f)
        curveTo(13.6569f, 6.5f, 15f, 7.84315f, 15f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(16.0588f, 2f, 19.5f, 5.42803f, 19.5f, 9.5869f)
        curveTo(19.5f, 13.812f, 16.0028f, 16.777f, 12.7725f, 18.7932f)
        curveTo(12.5371f, 18.9287f, 12.2709f, 19f, 12f, 19f)
        curveTo(11.7291f, 19f, 11.4629f, 18.9287f, 11.2275f, 18.7932f)
        curveTo(8.00325f, 16.7573f, 4.5f, 13.8266f, 4.5f, 9.5869f)
        curveTo(4.5f, 5.42803f, 7.9412f, 2f, 12f, 2f)
        }
        }.build()

        return _location09!!
    }

private var _location09: ImageVector? = null
