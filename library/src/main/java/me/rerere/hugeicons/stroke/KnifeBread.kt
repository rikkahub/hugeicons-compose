package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KnifeBread: ImageVector
    get() {
        if (_knifeBread != null) {
            return _knifeBread!!
        }
        _knifeBread = ImageVector.Builder(
            name = "KnifeBread",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9408f, 15.8962f)
        curveTo(11.3869f, 16.3785f, 11.8594f, 17.1338f, 12.5909f, 17.0175f)
        curveTo(12.943f, 16.9615f, 13.2331f, 16.6478f, 13.8134f, 16.0204f)
        lineTo(15.4749f, 14.2239f)
        lineTo(15.8549f, 12.1693f)
        lineTo(17.7551f, 11.7583f)
        lineTo(18.1352f, 9.70371f)
        lineTo(20.0354f, 9.29279f)
        lineTo(20.6175f, 7.23529f)
        lineTo(21.6541f, 6.96268f)
        curveTo(22.1189f, 6.84042f, 22.3514f, 6.77929f, 22.4549f, 6.56164f)
        curveTo(22.5585f, 6.34398f, 22.4735f, 6.13125f, 22.3035f, 5.70579f)
        curveTo(22.0445f, 5.05764f, 21.6283f, 4.2661f, 21.0425f, 3.8879f)
        curveTo(19.5355f, 2.70403f, 17.4949f, 2.70403f, 15.9879f, 3.8879f)
        curveTo(15.7142f, 4.10296f, 15.4317f, 4.40836f, 14.8668f, 5.01917f)
        lineTo(2.99976f, 17.8504f)
        curveTo(2.33341f, 18.5709f, 2.33341f, 19.7391f, 2.99976f, 20.4596f)
        curveTo(3.75522f, 21.2764f, 5.01122f, 21.1502f, 5.61452f, 20.1968f)
        lineTo(8.15899f, 16.1758f)
        curveTo(8.53248f, 15.5856f, 8.94586f, 14.7353f, 9.74298f, 14.8926f)
        curveTo(10.0729f, 14.9578f, 10.3622f, 15.2706f, 10.9408f, 15.8962f)
        }
        }.build()

        return _knifeBread!!
    }

private var _knifeBread: ImageVector? = null
