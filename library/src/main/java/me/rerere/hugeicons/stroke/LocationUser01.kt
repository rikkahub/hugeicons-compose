package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationUser01: ImageVector
    get() {
        if (_locationUser01 != null) {
            return _locationUser01!!
        }
        _locationUser01 = ImageVector.Builder(
            name = "LocationUser01",
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
        moveTo(13.1977f, 8f)
        horizontalLineTo(10.8023f)
        curveTo(7.35836f, 8f, 5.03641f, 11.5806f, 6.39304f, 14.7994f)
        curveTo(6.58202f, 15.2477f, 7.0156f, 15.5385f, 7.49535f, 15.5385f)
        horizontalLineTo(8.33892f)
        curveTo(8.62326f, 15.5385f, 8.87111f, 15.7352f, 8.94007f, 16.0157f)
        lineTo(10.0261f, 20.4328f)
        curveTo(10.2525f, 21.3539f, 11.0663f, 22f, 12f, 22f)
        curveTo(12.9337f, 22f, 13.7475f, 21.3539f, 13.9739f, 20.4328f)
        lineTo(15.0599f, 16.0157f)
        curveTo(15.1289f, 15.7352f, 15.3767f, 15.5385f, 15.6611f, 15.5385f)
        horizontalLineTo(16.5047f)
        curveTo(16.9844f, 15.5385f, 17.418f, 15.2477f, 17.607f, 14.7994f)
        curveTo(18.9636f, 11.5806f, 16.6416f, 8f, 13.1977f, 8f)
        }
        }.build()

        return _locationUser01!!
    }

private var _locationUser01: ImageVector? = null
