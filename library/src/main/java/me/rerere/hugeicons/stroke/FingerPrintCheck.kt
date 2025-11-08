package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FingerPrintCheck: ImageVector
    get() {
        if (_fingerPrintCheck != null) {
            return _fingerPrintCheck!!
        }
        _fingerPrintCheck = ImageVector.Builder(
            name = "FingerPrintCheck",
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
        moveTo(5.92683f, 20.5968f)
        curveTo(3.85533f, 19.1894f, 2.5f, 16.8511f, 2.5f, 14.2044f)
        verticalLineTo(9.75383f)
        curveTo(2.5f, 8.56968f, 2.7713f, 7.44725f, 3.25666f, 6.4423f)
        moveTo(9.35367f, 21.914f)
        curveTo(10.255f, 22.0396f, 11.145f, 22.007f, 11.9952f, 21.8397f)
        moveTo(17.7224f, 6.4159f)
        curveTo(15.6293f, 2.12426f, 9.8958f, 0.664733f, 5.92683f, 3.36135f)
        moveTo(18.4919f, 10.3293f)
        verticalLineTo(11.4954f)
        moveTo(10.4959f, 5.99807f)
        curveTo(12.7039f, 5.99807f, 14.4939f, 7.87756f, 14.4939f, 10.196f)
        moveTo(6.88271f, 8.39691f)
        curveTo(6.63601f, 8.9422f, 6.49797f, 9.55219f, 6.49797f, 10.196f)
        verticalLineTo(13.7943f)
        curveTo(6.49797f, 16.1128f, 8.28793f, 17.9923f, 10.4959f, 17.9923f)
        curveTo(10.6652f, 17.9923f, 10.832f, 17.9813f, 10.9957f, 17.9598f)
        moveTo(10.4959f, 10.4959f)
        verticalLineTo(13.4945f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.1702f, 18.447f)
        curveTo(16.4706f, 18.5912f, 16.8432f, 18.9639f, 17.0235f, 19.2643f)
        curveTo(17.0836f, 19.685f, 17.3841f, 18.0624f, 18.8505f, 17.1008f)
        moveTo(21.5f, 18f)
        curveTo(21.5f, 20.2091f, 19.7091f, 22f, 17.5f, 22f)
        curveTo(15.2909f, 22f, 13.5f, 20.2091f, 13.5f, 18f)
        curveTo(13.5f, 15.7909f, 15.2909f, 14f, 17.5f, 14f)
        curveTo(19.7091f, 14f, 21.5f, 15.7909f, 21.5f, 18f)
        }
        }.build()

        return _fingerPrintCheck!!
    }

private var _fingerPrintCheck: ImageVector? = null
