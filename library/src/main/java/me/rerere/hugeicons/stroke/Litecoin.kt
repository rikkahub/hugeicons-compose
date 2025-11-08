package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Litecoin: ImageVector
    get() {
        if (_litecoin != null) {
            return _litecoin!!
        }
        _litecoin = ImageVector.Builder(
            name = "Litecoin",
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
        moveTo(12f, 2f)
        curveTo(6.47716f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 6.5f)
        lineTo(10.1573f, 11.2953f)
        moveTo(10.1573f, 11.2953f)
        lineTo(9.29733f, 14.3667f)
        curveTo(9.02356f, 15.3444f, 8.88667f, 15.8333f, 9.12667f, 16.1667f)
        curveTo(9.36667f, 16.5f, 9.85556f, 16.5f, 10.8333f, 16.5f)
        horizontalLineTo(15.5f)
        moveTo(10.1573f, 11.2953f)
        lineTo(7.5f, 12.3333f)
        moveTo(10.1573f, 11.2953f)
        lineTo(13.9f, 9.83333f)
        }
        }.build()

        return _litecoin!!
    }

private var _litecoin: ImageVector? = null
