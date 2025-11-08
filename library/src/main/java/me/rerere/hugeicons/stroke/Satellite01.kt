package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Satellite01: ImageVector
    get() {
        if (_satellite01 != null) {
            return _satellite01!!
        }
        _satellite01 = ImageVector.Builder(
            name = "Satellite01",
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
        moveTo(20.3068f, 15.3312f)
        curveTo(16.7859f, 18.8521f, 11.1336f, 18.908f, 7.61276f, 15.3872f)
        curveTo(4.09192f, 11.8663f, 4.14799f, 6.21408f, 7.66883f, 2.69323f)
        moveTo(20.3068f, 15.3312f)
        curveTo(21.9837f, 13.6543f, 20.5139f, 9.46584f, 17.0241f, 5.97596f)
        curveTo(13.5342f, 2.48608f, 9.34571f, 1.01635f, 7.66883f, 2.69323f)
        moveTo(20.3068f, 15.3312f)
        curveTo(18.6299f, 17.0081f, 14.4414f, 15.5384f, 10.9516f, 12.0485f)
        moveTo(7.66883f, 2.69323f)
        curveTo(5.99196f, 4.37011f, 7.46169f, 8.55859f, 10.9516f, 12.0485f)
        moveTo(10.9516f, 12.0485f)
        lineTo(14f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.48804f, 15f)
        lineTo(4.75106f, 17.4884f)
        curveTo(3.3523f, 19.4923f, 2.65291f, 20.4942f, 3.17039f, 21.2471f)
        curveTo(3.68787f, 22f, 5.07589f, 22f, 7.85193f, 22f)
        horizontalLineTo(12.1481f)
        curveTo(14.9241f, 22f, 16.3121f, 22f, 16.8296f, 21.2471f)
        curveTo(17.301f, 20.5612f, 16.7625f, 19.6686f, 15.6053f, 18f)
        }
        }.build()

        return _satellite01!!
    }

private var _satellite01: ImageVector? = null
