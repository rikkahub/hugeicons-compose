package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LicenseDraft: ImageVector
    get() {
        if (_licenseDraft != null) {
            return _licenseDraft!!
        }
        _licenseDraft = ImageVector.Builder(
            name = "LicenseDraft",
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
        moveTo(19.7502f, 11f)
        verticalLineTo(10f)
        curveTo(19.7502f, 6.22876f, 19.7502f, 4.34315f, 18.5786f, 3.17157f)
        curveTo(17.407f, 2f, 15.5214f, 2f, 11.7502f, 2f)
        horizontalLineTo(10.7503f)
        curveTo(6.97907f, 2f, 5.09346f, 2f, 3.92189f, 3.17156f)
        curveTo(2.75032f, 4.34312f, 2.7503f, 6.22872f, 2.75027f, 9.99993f)
        lineTo(2.75024f, 14f)
        curveTo(2.7502f, 17.7712f, 2.75019f, 19.6568f, 3.92172f, 20.8284f)
        curveTo(5.09329f, 21.9999f, 6.97897f, 22f, 10.7502f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.25024f, 7f)
        horizontalLineTo(15.2502f)
        moveTo(7.25024f, 12f)
        horizontalLineTo(15.2502f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.2502f, 20.8268f)
        verticalLineTo(22f)
        horizontalLineTo(14.4236f)
        curveTo(14.833f, 22f, 15.0377f, 22f, 15.2217f, 21.9238f)
        curveTo(15.4058f, 21.8475f, 15.5505f, 21.7028f, 15.84f, 21.4134f)
        lineTo(20.6636f, 16.5894f)
        curveTo(20.9366f, 16.3164f, 21.0731f, 16.1799f, 21.1461f, 16.0327f)
        curveTo(21.285f, 15.7525f, 21.285f, 15.4236f, 21.1461f, 15.1434f)
        curveTo(21.0731f, 14.9961f, 20.9366f, 14.8596f, 20.6636f, 14.5866f)
        curveTo(20.3905f, 14.3136f, 20.254f, 14.1771f, 20.1067f, 14.1041f)
        curveTo(19.8265f, 13.9653f, 19.4975f, 13.9653f, 19.2173f, 14.1041f)
        curveTo(19.0701f, 14.1771f, 18.9335f, 14.3136f, 18.6605f, 14.5866f)
        lineTo(18.6605f, 14.5866f)
        lineTo(13.8369f, 19.4106f)
        curveTo(13.5474f, 19.7f, 13.4027f, 19.8447f, 13.3265f, 20.0287f)
        curveTo(13.2502f, 20.2128f, 13.2502f, 20.4174f, 13.2502f, 20.8268f)
        }
        }.build()

        return _licenseDraft!!
    }

private var _licenseDraft: ImageVector? = null
