package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Airdrop: ImageVector
    get() {
        if (_airdrop != null) {
            return _airdrop!!
        }
        _airdrop = ImageVector.Builder(
            name = "Airdrop",
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
        moveTo(4f, 17.001f)
        curveTo(2.74418f, 15.3295f, 2f, 13.2516f, 2f, 11f)
        curveTo(2f, 5.47715f, 6.47715f, 1f, 12f, 1f)
        curveTo(17.5228f, 1f, 22f, 5.47715f, 22f, 11f)
        curveTo(22f, 13.2516f, 21.2558f, 15.3295f, 20f, 17.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.52779f, 15f)
        curveTo(6.57771f, 13.9385f, 6f, 12.5367f, 6f, 11f)
        curveTo(6f, 7.68629f, 8.68629f, 5f, 12f, 5f)
        curveTo(15.3137f, 5f, 18f, 7.68629f, 18f, 11f)
        curveTo(18f, 12.5367f, 17.4223f, 13.9385f, 16.4722f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.95154f, 17.8759f)
        curveTo(10.7222f, 16.758f, 11.1076f, 16.199f, 11.6078f, 16.0553f)
        curveTo(11.8644f, 15.9816f, 12.1356f, 15.9816f, 12.3922f, 16.0553f)
        curveTo(12.8924f, 16.199f, 13.2778f, 16.758f, 14.0485f, 17.8759f)
        curveTo(15.074f, 19.3633f, 15.5867f, 20.1071f, 15.488f, 20.727f)
        curveTo(15.4379f, 21.0414f, 15.2938f, 21.3315f, 15.076f, 21.5565f)
        curveTo(14.6465f, 22f, 13.7643f, 22f, 12f, 22f)
        curveTo(10.2357f, 22f, 9.35352f, 22f, 8.92399f, 21.5565f)
        curveTo(8.70617f, 21.3315f, 8.56205f, 21.0414f, 8.512f, 20.727f)
        curveTo(8.4133f, 20.1071f, 8.92605f, 19.3633f, 9.95154f, 17.8759f)
        }
        }.build()

        return _airdrop!!
    }

private var _airdrop: ImageVector? = null
