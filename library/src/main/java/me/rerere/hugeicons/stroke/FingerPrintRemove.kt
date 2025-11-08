package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FingerPrintRemove: ImageVector
    get() {
        if (_fingerPrintRemove != null) {
            return _fingerPrintRemove!!
        }
        _fingerPrintRemove = ImageVector.Builder(
            name = "FingerPrintRemove",
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
        moveTo(18.4428f, 17.0572f)
        lineTo(17.5f, 18f)
        moveTo(17.5f, 18f)
        lineTo(16.5572f, 18.9428f)
        moveTo(17.5f, 18f)
        lineTo(18.4428f, 18.9428f)
        moveTo(17.5f, 18f)
        lineTo(16.5572f, 17.0572f)
        moveTo(20.3284f, 20.8284f)
        curveTo(18.7663f, 22.3905f, 16.2337f, 22.3905f, 14.6716f, 20.8284f)
        curveTo(13.1095f, 19.2663f, 13.1095f, 16.7337f, 14.6716f, 15.1716f)
        curveTo(16.2337f, 13.6095f, 18.7663f, 13.6095f, 20.3284f, 15.1716f)
        curveTo(21.8905f, 16.7337f, 21.8905f, 19.2663f, 20.3284f, 20.8284f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.92857f, 20.6058f)
        curveTo(3.85602f, 19.1977f, 2.5f, 16.8583f, 2.5f, 14.2103f)
        verticalLineTo(9.75757f)
        curveTo(2.5f, 8.57285f, 2.77144f, 7.44988f, 3.25704f, 6.44444f)
        moveTo(9.35714f, 21.9236f)
        curveTo(10.2589f, 22.0493f, 11.1494f, 22.0167f, 12f, 21.8493f)
        moveTo(17.7301f, 6.41803f)
        curveTo(15.636f, 2.12432f, 9.89955f, 0.664089f, 5.92857f, 3.36201f)
        moveTo(18.5f, 10.3333f)
        verticalLineTo(11.5f)
        moveTo(10.5f, 6f)
        curveTo(12.7091f, 6f, 14.5f, 7.8804f, 14.5f, 10.2f)
        moveTo(6.88493f, 8.4f)
        curveTo(6.63811f, 8.94555f, 6.5f, 9.55584f, 6.5f, 10.2f)
        verticalLineTo(13.8f)
        curveTo(6.5f, 16.1196f, 8.29086f, 18f, 10.5f, 18f)
        curveTo(10.6693f, 18f, 10.8362f, 17.989f, 11f, 17.9675f)
        moveTo(10.5f, 10.5f)
        verticalLineTo(13.5f)
        }
        }.build()

        return _fingerPrintRemove!!
    }

private var _fingerPrintRemove: ImageVector? = null
