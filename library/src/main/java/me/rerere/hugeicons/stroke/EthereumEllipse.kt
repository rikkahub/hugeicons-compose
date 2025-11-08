package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EthereumEllipse: ImageVector
    get() {
        if (_ethereumEllipse != null) {
            return _ethereumEllipse!!
        }
        _ethereumEllipse = ImageVector.Builder(
            name = "EthereumEllipse",
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
        moveTo(8f, 12f)
        lineTo(12f, 6f)
        lineTo(16f, 12f)
        moveTo(8f, 12f)
        lineTo(12f, 18f)
        lineTo(16f, 12f)
        moveTo(8f, 12f)
        lineTo(12f, 13.5f)
        lineTo(16f, 12f)
        }
        }.build()

        return _ethereumEllipse!!
    }

private var _ethereumEllipse: ImageVector? = null
