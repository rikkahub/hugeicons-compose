package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MirroringScreen: ImageVector
    get() {
        if (_mirroringScreen != null) {
            return _mirroringScreen!!
        }
        _mirroringScreen = ImageVector.Builder(
            name = "MirroringScreen",
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
        moveTo(4f, 21f)
        curveTo(4f, 19.8954f, 3.10457f, 19f, 2f, 19f)
        moveTo(8f, 21f)
        curveTo(8f, 17.6863f, 5.31371f, 15f, 2f, 15f)
        moveTo(12f, 21f)
        curveTo(12f, 15.4772f, 7.52285f, 11f, 2f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8.00027f)
        curveTo(3.0779f, 6.12787f, 3.32904f, 4.97985f, 4.1387f, 4.17164f)
        curveTo(5.31244f, 3f, 7.20153f, 3f, 10.9797f, 3f)
        horizontalLineTo(13.9853f)
        curveTo(17.7634f, 3f, 19.6525f, 3f, 20.8263f, 4.17164f)
        curveTo(22f, 5.34327f, 22f, 7.229f, 22f, 11.0004f)
        verticalLineTo(12.0005f)
        curveTo(22f, 15.7719f, 22f, 17.6577f, 20.8263f, 18.8293f)
        curveTo(19.7612f, 19.8924f, 18.1071f, 19.9909f, 14.9871f, 20f)
        }
        }.build()

        return _mirroringScreen!!
    }

private var _mirroringScreen: ImageVector? = null
