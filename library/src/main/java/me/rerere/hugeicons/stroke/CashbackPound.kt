package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CashbackPound: ImageVector
    get() {
        if (_cashbackPound != null) {
            return _cashbackPound!!
        }
        _cashbackPound = ImageVector.Builder(
            name = "CashbackPound",
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
        moveTo(2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(7.89936f, 2f, 4.3752f, 4.46819f, 2.83209f, 8f)
        moveTo(2f, 4.5f)
        lineTo(2.5f, 8.5f)
        lineTo(6.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 12f)
        curveTo(11.1193f, 12f, 10f, 10.8807f, 10f, 9.5f)
        curveTo(10f, 8.11929f, 11.1193f, 7f, 12.5f, 7f)
        curveTo(13.8807f, 7f, 15f, 8.11929f, 15f, 9.5f)
        moveTo(12.5f, 12f)
        curveTo(11.5f, 14.5f, 9f, 16f, 9f, 16f)
        horizontalLineTo(13.5858f)
        curveTo(14.4913f, 16f, 15.3597f, 15.6403f, 16f, 15f)
        moveTo(12.5f, 12f)
        horizontalLineTo(9f)
        moveTo(12.5f, 12f)
        horizontalLineTo(14f)
        }
        }.build()

        return _cashbackPound!!
    }

private var _cashbackPound: ImageVector? = null
