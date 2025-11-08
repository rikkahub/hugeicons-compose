package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Simcard01: ImageVector
    get() {
        if (_simcard01 != null) {
            return _simcard01!!
        }
        _simcard01 = ImageVector.Builder(
            name = "Simcard01",
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
        moveTo(9.5f, 18f)
        lineTo(8.38792f, 17.0607f)
        curveTo(7.79597f, 16.5607f, 7.5f, 16.3107f, 7.5f, 16f)
        curveTo(7.5f, 15.6893f, 7.79597f, 15.4393f, 8.38792f, 14.9393f)
        lineTo(9.5f, 14f)
        moveTo(14.5f, 14f)
        lineTo(15.6121f, 14.9393f)
        curveTo(16.204f, 15.4393f, 16.5f, 15.6893f, 16.5f, 16f)
        curveTo(16.5f, 16.3107f, 16.204f, 16.5607f, 15.6121f, 17.0607f)
        lineTo(14.5f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 11.8584f)
        curveTo(3f, 7.28199f, 3f, 4.99376f, 4.38674f, 3.54394f)
        curveTo(4.43797f, 3.49038f, 4.49038f, 3.43797f, 4.54394f, 3.38674f)
        curveTo(5.99376f, 2f, 8.28199f, 2f, 12.8584f, 2f)
        curveTo(13.943f, 2f, 14.4655f, 2.00376f, 14.9628f, 2.18936f)
        curveTo(15.4417f, 2.3681f, 15.8429f, 2.70239f, 16.6452f, 3.37099f)
        lineTo(18.8411f, 5.20092f)
        curveTo(19.9027f, 6.08561f, 20.4335f, 6.52795f, 20.7168f, 7.13266f)
        curveTo(21f, 7.73737f, 21f, 8.42833f, 21f, 9.81025f)
        verticalLineTo(13f)
        curveTo(21f, 16.7497f, 21f, 18.6246f, 20.0451f, 19.9389f)
        curveTo(19.7367f, 20.3634f, 19.3634f, 20.7367f, 18.9389f, 21.0451f)
        curveTo(17.6246f, 22f, 15.7497f, 22f, 12f, 22f)
        curveTo(8.25027f, 22f, 6.3754f, 22f, 5.06107f, 21.0451f)
        curveTo(4.6366f, 20.7367f, 4.26331f, 20.3634f, 3.95491f, 19.9389f)
        curveTo(3f, 18.6246f, 3f, 16.7497f, 3f, 13f)
        verticalLineTo(11.8584f)
        }
        }.build()

        return _simcard01!!
    }

private var _simcard01: ImageVector? = null
