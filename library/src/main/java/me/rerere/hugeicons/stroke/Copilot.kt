package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Copilot: ImageVector
    get() {
        if (_copilot != null) {
            return _copilot!!
        }
        _copilot = ImageVector.Builder(
            name = "Copilot",
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
        moveTo(13.8461f, 4f)
        curveTo(14.6683f, 4f, 15.3801f, 4.62364f, 15.5584f, 5.50016f)
        lineTo(15.7715f, 6.54763f)
        curveTo(16.0037f, 7.68837f, 16.93f, 8.5f, 18f, 8.5f)
        horizontalLineTo(11.3827f)
        moveTo(13.8461f, 4f)
        curveTo(13.0551f, 4f, 12.362f, 4.57821f, 12.1539f, 5.41168f)
        lineTo(11.3827f, 8.5f)
        moveTo(13.8461f, 4f)
        horizontalLineTo(7.97888f)
        curveTo(6.32731f, 4f, 4.88008f, 5.20729f, 4.44552f, 6.94753f)
        lineTo(3.06556f, 12.9738f)
        curveTo(2.74786f, 14.246f, 3.62479f, 15.5f, 4.83224f, 15.5f)
        horizontalLineTo(7.66156f)
        curveTo(8.90024f, 15.5f, 9.98567f, 14.5945f, 10.3116f, 13.2894f)
        lineTo(11.3827f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.1539f, 20f)
        curveTo(9.33175f, 20f, 8.61992f, 19.3764f, 8.44158f, 18.4998f)
        lineTo(8.22845f, 17.4524f)
        curveTo(7.99635f, 16.3116f, 7.06995f, 15.5f, 6f, 15.5f)
        lineTo(12.6173f, 15.5f)
        moveTo(10.1539f, 20f)
        curveTo(10.9449f, 20f, 11.638f, 19.4218f, 11.8461f, 18.5883f)
        lineTo(12.6173f, 15.5f)
        moveTo(10.1539f, 20f)
        lineTo(16.0211f, 20f)
        curveTo(17.6727f, 20f, 19.1199f, 18.7927f, 19.5545f, 17.0525f)
        lineTo(20.9344f, 11.0262f)
        curveTo(21.2521f, 9.75395f, 20.3752f, 8.5f, 19.1678f, 8.5f)
        lineTo(16.3384f, 8.5f)
        curveTo(15.0998f, 8.5f, 14.0143f, 9.40546f, 13.6884f, 10.7106f)
        lineTo(12.6173f, 15.5f)
        }
        }.build()

        return _copilot!!
    }

private var _copilot: ImageVector? = null
