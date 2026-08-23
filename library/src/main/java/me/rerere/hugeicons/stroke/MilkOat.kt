package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.7164f, 13.7153f)
            curveTo(12.3317f, 15.0994f, 13.024f, 18.5595f, 15.1011f, 20.6357f)
            curveTo(17.1782f, 22.7118f, 19.1104f, 22.1645f, 20.64f, 20.6357f)
            curveTo(22.1695f, 19.1068f, 22.717f, 17.1755f, 20.64f, 15.0994f)
            curveTo(18.5628f, 13.0232f, 15.1011f, 12.3312f, 13.7164f, 13.7153f)
            close()
            moveTo(20.64f, 20.6357f)
            lineTo(13.7164f, 13.7153f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
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
            moveTo(18.0263f, 10.4828f)
            verticalLineTo(8.0386f)
            lineTo(15.7403f, 5.21502f)
            curveTo(15.5918f, 5.03157f, 15.5129f, 4.80149f, 15.5177f, 4.5655f)
            lineTo(15.5387f, 3.53213f)
            curveTo(15.5557f, 2.69197f, 14.8793f, 2.00171f, 14.039f, 2.00171f)
            horizontalLineTo(6.4856f)
            curveTo(5.65717f, 2.00171f, 4.9856f, 2.67328f, 4.9856f, 3.50171f)
            verticalLineTo(4.94586f)
            moveTo(8.00115f, 8.0386f)
            verticalLineTo(21.9985f)
            moveTo(8.00115f, 8.0386f)
            horizontalLineTo(18.0263f)
        }
        }.build()

        return _milkOat!!
    }

private var _milkOat: ImageVector? = null
