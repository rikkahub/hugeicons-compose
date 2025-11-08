package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Vine: ImageVector
    get() {
        if (_vine != null) {
            return _vine!!
        }
        _vine = ImageVector.Builder(
            name = "Vine",
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
        moveTo(3.04261f, 4.41495f)
        curveTo(2.7122f, 8.99913f, 4.26712f, 17.1284f, 8.97309f, 21.0871f)
        curveTo(10.406f, 22.2925f, 11.9014f, 22.3165f, 13.3266f, 21.0857f)
        curveTo(15.6727f, 19.0596f, 17.3041f, 15.9398f, 18.2214f, 14.2938f)
        curveTo(18.2214f, 14.2938f, 19.3849f, 14.6873f, 20.3522f, 14.7846f)
        curveTo(20.931f, 14.8427f, 21.4613f, 11.7387f, 20.3517f, 11.7315f)
        curveTo(17.4157f, 11.7122f, 14.1381f, 11.4181f, 13.6775f, 8.14692f)
        curveTo(13.1726f, 4.56122f, 17.2116f, 5.07346f, 16.7068f, 8.19571f)
        curveTo(17.7165f, 9.17141f, 19.7361f, 9.17141f, 19.7361f, 9.17141f)
        curveTo(20.7458f, 6.09795f, 18.7263f, 2f, 15.697f, 2f)
        curveTo(11.6579f, 2f, 10.1433f, 4.95167f, 10.1433f, 7.12244f)
        curveTo(10.1433f, 12.7571f, 14.6872f, 13.7816f, 14.6872f, 13.7816f)
        curveTo(13.9496f, 15.6526f, 12.6725f, 16.9898f, 11.8409f, 17.7649f)
        curveTo(11.2705f, 18.2965f, 11.0258f, 18.3051f, 10.5066f, 17.7152f)
        curveTo(7.16109f, 13.9145f, 6.21504f, 7.99135f, 6.55256f, 4.51754f)
        curveTo(6.62801f, 3.74099f, 3.10939f, 3.48846f, 3.04261f, 4.41495f)
        }
        }.build()

        return _vine!!
    }

private var _vine: ImageVector? = null
