package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MenuRestaurant: ImageVector
    get() {
        if (_menuRestaurant != null) {
            return _menuRestaurant!!
        }
        _menuRestaurant = ImageVector.Builder(
            name = "MenuRestaurant",
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
        moveTo(20f, 17.9998f)
        verticalLineTo(9.99976f)
        curveTo(20f, 8.11414f, 20f, 7.17133f, 19.4142f, 6.58554f)
        curveTo(18.8284f, 5.99976f, 17.8856f, 5.99976f, 16f, 5.99976f)
        horizontalLineTo(4f)
        verticalLineTo(17.9998f)
        curveTo(4f, 19.8854f, 4f, 20.8282f, 4.58579f, 21.414f)
        curveTo(5.17157f, 21.9998f, 6.11438f, 21.9998f, 8f, 21.9998f)
        horizontalLineTo(16f)
        curveTo(17.8856f, 21.9998f, 18.8284f, 21.9998f, 19.4142f, 21.414f)
        curveTo(20f, 20.8282f, 20f, 19.8854f, 20f, 17.9998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10.9998f)
        curveTo(13.6569f, 10.9998f, 15f, 12.3429f, 15f, 13.9998f)
        moveTo(12f, 10.9998f)
        curveTo(10.3431f, 10.9998f, 9f, 12.3429f, 9f, 13.9998f)
        moveTo(12f, 10.9998f)
        verticalLineTo(9.99976f)
        moveTo(15f, 13.9998f)
        horizontalLineTo(9f)
        moveTo(15f, 13.9998f)
        horizontalLineTo(16f)
        moveTo(9f, 13.9998f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17.9998f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 5.99976f)
        lineTo(11.3846f, 2.90562f)
        curveTo(13.0337f, 2.21467f, 13.8582f, 1.8692f, 14.5149f, 2.04518f)
        curveTo(14.9408f, 2.1593f, 15.3173f, 2.41168f, 15.5859f, 2.76312f)
        curveTo(16f, 3.30508f, 16f, 4.2033f, 16f, 5.99976f)
        }
        }.build()

        return _menuRestaurant!!
    }

private var _menuRestaurant: ImageVector? = null
