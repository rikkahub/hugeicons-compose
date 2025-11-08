package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MilkBottle: ImageVector
    get() {
        if (_milkBottle != null) {
            return _milkBottle!!
        }
        _milkBottle = ImageVector.Builder(
            name = "MilkBottle",
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
        moveTo(14.7273f, 5f)
        curveTo(15.631f, 5f, 16.3636f, 4.32843f, 16.3636f, 3.5f)
        curveTo(16.3636f, 2.67157f, 15.631f, 2f, 14.7273f, 2f)
        horizontalLineTo(9.27273f)
        curveTo(8.36899f, 2f, 7.63636f, 2.67157f, 7.63636f, 3.5f)
        curveTo(7.63636f, 4.32843f, 8.36899f, 5f, 9.27273f, 5f)
        moveTo(15.2459f, 4.92311f)
        curveTo(16.8664f, 7.89408f, 18f, 10.3773f, 18f, 13.7771f)
        verticalLineTo(18f)
        curveTo(18f, 21.3093f, 17.2465f, 22f, 13.6364f, 22f)
        horizontalLineTo(10.3636f)
        curveTo(6.75345f, 22f, 6f, 21.3093f, 6f, 18f)
        verticalLineTo(13.7771f)
        curveTo(6f, 10.3773f, 7.10674f, 7.88562f, 8.72727f, 4.91465f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        curveTo(6.57143f, 12.5f, 8.09206f, 12.4761f, 8.98433f, 12.2789f)
        curveTo(9.60646f, 12.1415f, 10.2768f, 12.3027f, 10.6984f, 12.7639f)
        lineTo(11.523f, 13.6658f)
        curveTo(11.9973f, 14.1846f, 12.7163f, 14.4309f, 13.4245f, 14.3173f)
        lineTo(14.4681f, 14.1499f)
        curveTo(15.0422f, 14.0578f, 15.6132f, 14.2904f, 16.004f, 14.7055f)
        curveTo(17.2226f, 16f, 18f, 16f, 18f, 16f)
        }
        }.build()

        return _milkBottle!!
    }

private var _milkBottle: ImageVector? = null
