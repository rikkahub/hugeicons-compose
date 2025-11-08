package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBag02: ImageVector
    get() {
        if (_shoppingBag02 != null) {
            return _shoppingBag02!!
        }
        _shoppingBag02 = ImageVector.Builder(
            name = "ShoppingBag02",
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
        moveTo(17.5f, 8.75f)
        lineTo(15.0447f, 19.5532f)
        curveTo(15.015f, 19.684f, 15f, 19.8177f, 15f, 19.9518f)
        curveTo(15f, 20.9449f, 15.8051f, 21.75f, 16.7982f, 21.75f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.2192f, 21.75f)
        horizontalLineTo(4.78078f)
        curveTo(3.79728f, 21.75f, 3f, 20.9527f, 3f, 19.9692f)
        curveTo(3f, 19.8236f, 3.01786f, 19.6786f, 3.05317f, 19.5373f)
        lineTo(5.24254f, 10.7799f)
        curveTo(5.60631f, 9.32474f, 5.78821f, 8.59718f, 6.33073f, 8.17359f)
        curveTo(6.87325f, 7.75f, 7.6232f, 7.75f, 9.12311f, 7.75f)
        horizontalLineTo(14.8769f)
        curveTo(16.3768f, 7.75f, 17.1267f, 7.75f, 17.6693f, 8.17359f)
        curveTo(18.2118f, 8.59718f, 18.3937f, 9.32474f, 18.7575f, 10.7799f)
        lineTo(20.9468f, 19.5373f)
        curveTo(20.9821f, 19.6786f, 21f, 19.8236f, 21f, 19.9692f)
        curveTo(21f, 20.9527f, 20.2027f, 21.75f, 19.2192f, 21.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7.75f)
        verticalLineTo(5.75f)
        curveTo(15f, 4.09315f, 13.6569f, 2.75f, 12f, 2.75f)
        curveTo(10.3431f, 2.75f, 9f, 4.09315f, 9f, 5.75f)
        verticalLineTo(7.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 10.75f)
        horizontalLineTo(12.5f)
        }
        }.build()

        return _shoppingBag02!!
    }

private var _shoppingBag02: ImageVector? = null
