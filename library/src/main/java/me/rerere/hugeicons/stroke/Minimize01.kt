package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Minimize01: ImageVector
    get() {
        if (_minimize01 != null) {
            return _minimize01!!
        }
        _minimize01 = ImageVector.Builder(
            name = "Minimize01",
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
        moveTo(19.9264f, 22.2502f)
        verticalLineTo(20.6912f)
        curveTo(19.9264f, 20.2886f, 20.0525f, 19.8976f, 20.2639f, 19.5545f)
        curveTo(21.7583f, 17.1282f, 22.2279f, 14.5259f, 21.9002f, 13.5123f)
        curveTo(20.857f, 11.3512f, 17.3758f, 10.5009f, 15.76f, 10.2983f)
        lineTo(16.7966f, 5.13851f)
        curveTo(16.9705f, 4.32028f, 16.3513f, 3.4966f, 15.4135f, 3.29877f)
        curveTo(14.4758f, 3.10095f, 13.5746f, 3.6039f, 13.4007f, 4.42213f)
        lineTo(11.3462f, 14.0882f)
        lineTo(8.77462f, 12.4508f)
        curveTo(8.77462f, 12.4508f, 7.47969f, 11.4154f, 6.44041f, 12.4508f)
        curveTo(5.40114f, 13.4861f, 6.44041f, 14.7762f, 6.44041f, 14.7762f)
        lineTo(10.3488f, 19.7787f)
        curveTo(10.6003f, 20.1005f, 10.7468f, 20.4912f, 10.7688f, 20.8984f)
        lineTo(10.8401f, 22.2164f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.95693f, 2.2382f)
        curveTo(6.95693f, 2.2382f, 6.7053f, 4.50936f, 6.95693f, 4.75695f)
        moveTo(6.95693f, 4.75695f)
        curveTo(7.28338f, 5.07806f, 9.55878f, 4.80775f, 9.55878f, 4.80775f)
        moveTo(6.95693f, 4.75695f)
        lineTo(10.001f, 1.74805f)
        moveTo(5.04502f, 9.24998f)
        curveTo(5.04502f, 9.24998f, 5.29665f, 6.97882f, 5.04502f, 6.73124f)
        moveTo(5.04502f, 6.73124f)
        curveTo(4.71857f, 6.41012f, 2.44317f, 6.68043f, 2.44317f, 6.68043f)
        moveTo(5.04502f, 6.73124f)
        lineTo(2.00098f, 9.74014f)
        }
        }.build()

        return _minimize01!!
    }

private var _minimize01: ImageVector? = null
