package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wardrobe03: ImageVector
    get() {
        if (_wardrobe03 != null) {
            return _wardrobe03!!
        }
        _wardrobe03 = ImageVector.Builder(
            name = "Wardrobe03",
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
        moveTo(6f, 20f)
        verticalLineTo(22f)
        moveTo(18f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 16f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 14f)
        verticalLineTo(8f)
        curveTo(3f, 5.17157f, 3f, 3.75736f, 3.93037f, 2.87868f)
        curveTo(4.86073f, 2f, 6.35814f, 2f, 9.35294f, 2f)
        horizontalLineTo(14.6471f)
        curveTo(17.6419f, 2f, 19.1393f, 2f, 20.0696f, 2.87868f)
        curveTo(21f, 3.75736f, 21f, 5.17157f, 21f, 8f)
        verticalLineTo(14f)
        curveTo(21f, 16.8284f, 21f, 18.2426f, 20.0696f, 19.1213f)
        curveTo(19.1393f, 20f, 17.6419f, 20f, 14.6471f, 20f)
        horizontalLineTo(9.35294f)
        curveTo(6.35814f, 20f, 4.86073f, 20f, 3.93037f, 19.1213f)
        curveTo(3f, 18.2426f, 3f, 16.8284f, 3f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 10f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 10f)
        verticalLineTo(9f)
        }
        }.build()

        return _wardrobe03!!
    }

private var _wardrobe03: ImageVector? = null
