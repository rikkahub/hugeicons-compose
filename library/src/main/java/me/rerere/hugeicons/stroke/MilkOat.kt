package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MilkOat: ImageVector
    get() {
        if (_milkOat != null) {
            return _milkOat!!
        }
        _milkOat = ImageVector.Builder(
            name = "MilkOat",
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
        moveTo(20.64f, 20.6357f)
        curveTo(22.1695f, 19.1068f, 22.717f, 17.1755f, 20.64f, 15.0994f)
        curveTo(18.5628f, 13.0232f, 15.1011f, 12.3312f, 13.7164f, 13.7153f)
        moveTo(20.64f, 20.6357f)
        curveTo(19.1104f, 22.1645f, 17.1782f, 22.7118f, 15.1011f, 20.6357f)
        curveTo(13.024f, 18.5595f, 12.3317f, 15.0994f, 13.7164f, 13.7153f)
        moveTo(20.64f, 20.6357f)
        lineTo(13.7164f, 13.7153f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9419f, 21.9985f)
        horizontalLineTo(8.00115f)
        moveTo(4.9856f, 4.94586f)
        lineTo(2.56174f, 7.45742f)
        curveTo(2.20193f, 7.83025f, 2.00085f, 8.32816f, 2.00085f, 8.84629f)
        verticalLineTo(19.9985f)
        curveTo(2.00085f, 21.103f, 2.89628f, 21.9985f, 4.00085f, 21.9985f)
        horizontalLineTo(8.00115f)
        moveTo(4.9856f, 4.94586f)
        lineTo(8.00115f, 8.0386f)
        moveTo(4.9856f, 4.94586f)
        verticalLineTo(3.50171f)
        curveTo(4.9856f, 2.67328f, 5.65717f, 2.00171f, 6.4856f, 2.00171f)
        horizontalLineTo(14.039f)
        curveTo(14.8793f, 2.00171f, 15.5557f, 2.69197f, 15.5387f, 3.53213f)
        lineTo(15.5177f, 4.5655f)
        curveTo(15.5129f, 4.80149f, 15.5918f, 5.03157f, 15.7403f, 5.21502f)
        lineTo(18.0263f, 8.0386f)
        moveTo(8.00115f, 8.0386f)
        verticalLineTo(21.9985f)
        moveTo(8.00115f, 8.0386f)
        horizontalLineTo(18.0263f)
        moveTo(18.0263f, 8.0386f)
        verticalLineTo(10.4828f)
        }
        }.build()

        return _milkOat!!
    }

private var _milkOat: ImageVector? = null
