package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LassoTool01: ImageVector
    get() {
        if (_lassoTool01 != null) {
            return _lassoTool01!!
        }
        _lassoTool01 = ImageVector.Builder(
            name = "LassoTool01",
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
        moveTo(17.3003f, 15.5116f)
        curveTo(20.3416f, 12.9804f, 22.6484f, 9.95901f, 21.8354f, 6.92985f)
        curveTo(20.7852f, 3.01732f, 15.5349f, 1.02232f, 10.1083f, 2.4739f)
        curveTo(4.68179f, 3.92547f, 1.13402f, 8.27394f, 2.18415f, 12.1865f)
        curveTo(3.03697f, 15.3638f, 5.88849f, 16.9746f, 10.3503f, 16.42f)
        moveTo(17.3003f, 15.5116f)
        curveTo(15.9161f, 11.5244f, 9.71766f, 12.8164f, 10.002f, 15.5116f)
        curveTo(10.2129f, 17.5105f, 14.9298f, 17.5105f, 17.3003f, 15.5116f)
        moveTo(17.3003f, 15.5116f)
        curveTo(18.1269f, 18.2959f, 16.2449f, 21.4457f, 12.9572f, 22f)
        }
        }.build()

        return _lassoTool01!!
    }

private var _lassoTool01: ImageVector? = null
