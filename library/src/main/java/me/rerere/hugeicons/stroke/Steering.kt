package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Steering: ImageVector
    get() {
        if (_steering != null) {
            return _steering!!
        }
        _steering = ImageVector.Builder(
            name = "Steering",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.9181f, 10.4125f)
        curveTo(17.9491f, 10.8367f, 16.4851f, 11.218f, 15.1595f, 10.7168f)
        curveTo(13.2638f, 10f, 12.2893f, 10f, 12f, 10f)
        curveTo(11.7107f, 10f, 10.7362f, 10f, 8.84049f, 10.7168f)
        curveTo(7.51492f, 11.218f, 6.05092f, 10.8367f, 5.08186f, 10.4125f)
        moveTo(19f, 13.2548f)
        curveTo(16.8546f, 13.6631f, 13.6079f, 14.878f, 13.5238f, 19f)
        moveTo(10.4762f, 19f)
        curveTo(10.3921f, 14.878f, 7.14544f, 13.6631f, 5f, 13.2548f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.008f, 13f)
        lineTo(11.999f, 13f)
        }
        }.build()

        return _steering!!
    }

private var _steering: ImageVector? = null
