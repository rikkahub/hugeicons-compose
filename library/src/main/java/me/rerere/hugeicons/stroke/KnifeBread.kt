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
        moveTo(10.4408f, 15.8962f)
        curveTo(10.8869f, 16.3785f, 11.3594f, 17.1338f, 12.0909f, 17.0175f)
        curveTo(12.443f, 16.9615f, 12.7331f, 16.6478f, 13.3134f, 16.0204f)
        lineTo(14.9749f, 14.2239f)
        lineTo(15.3549f, 12.1693f)
        lineTo(17.2551f, 11.7583f)
        lineTo(17.6352f, 9.70371f)
        lineTo(19.5354f, 9.29279f)
        lineTo(20.1175f, 7.23529f)
        lineTo(21.1541f, 6.96268f)
        curveTo(21.6189f, 6.84042f, 21.8514f, 6.77929f, 21.9549f, 6.56164f)
        curveTo(22.0585f, 6.34398f, 21.9735f, 6.13125f, 21.8035f, 5.70579f)
        curveTo(21.5445f, 5.05764f, 21.1283f, 4.2661f, 20.5425f, 3.8879f)
        curveTo(19.0355f, 2.70403f, 16.9949f, 2.70403f, 15.4879f, 3.8879f)
        curveTo(15.2142f, 4.10296f, 14.9317f, 4.40836f, 14.3668f, 5.01917f)
        lineTo(2.49976f, 17.8504f)
        curveTo(1.83341f, 18.5709f, 1.83341f, 19.7391f, 2.49976f, 20.4596f)
        curveTo(3.25522f, 21.2764f, 4.51122f, 21.1502f, 5.11452f, 20.1968f)
        lineTo(7.65899f, 16.1758f)
        curveTo(8.03248f, 15.5856f, 8.44586f, 14.7353f, 9.24298f, 14.8926f)
        curveTo(9.57287f, 14.9578f, 9.86218f, 15.2706f, 10.4408f, 15.8962f)
        }
        }.build()

        return _knifeBread!!
    }

private var _knifeBread: ImageVector? = null
