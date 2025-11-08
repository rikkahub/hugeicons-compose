package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EiffelTower: ImageVector
    get() {
        if (_eiffelTower != null) {
            return _eiffelTower!!
        }
        _eiffelTower = ImageVector.Builder(
            name = "EiffelTower",
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
        moveTo(3f, 22f)
        curveTo(7.67798f, 16.3864f, 9.95978f, 9.8784f, 10.8382f, 4.98644f)
        curveTo(10.8643f, 4.84129f, 10.8773f, 4.76868f, 10.8931f, 4.71553f)
        curveTo(11.0101f, 4.32106f, 11.3323f, 4.05162f, 11.7412f, 4.00613f)
        curveTo(11.7963f, 4f, 11.8642f, 4f, 12f, 4f)
        curveTo(12.1358f, 4f, 12.2037f, 4f, 12.2588f, 4.00613f)
        curveTo(12.6677f, 4.05162f, 12.9899f, 4.32106f, 13.1069f, 4.71553f)
        curveTo(13.1227f, 4.76868f, 13.1357f, 4.84129f, 13.1618f, 4.98644f)
        curveTo(14.0402f, 9.8784f, 16.322f, 16.3864f, 21f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 11f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 15f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 22f)
        curveTo(15.2904f, 20.959f, 15.1855f, 20.4386f, 14.9348f, 19.9979f)
        curveTo(14.822f, 19.7995f, 14.6881f, 19.6148f, 14.5358f, 19.447f)
        curveTo(14.1973f, 19.0744f, 13.7412f, 18.8227f, 12.8289f, 18.3194f)
        curveTo(12.48f, 18.1269f, 12.3055f, 18.0306f, 12.1198f, 18.0074f)
        curveTo(12.0402f, 17.9975f, 11.9598f, 17.9975f, 11.8802f, 18.0074f)
        curveTo(11.6945f, 18.0306f, 11.52f, 18.1269f, 11.1711f, 18.3194f)
        curveTo(10.2588f, 18.8227f, 9.8027f, 19.0744f, 9.46424f, 19.447f)
        curveTo(9.31188f, 19.6148f, 9.17804f, 19.7995f, 9.06518f, 19.9979f)
        curveTo(8.81446f, 20.4386f, 8.70964f, 20.959f, 8.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 22f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(9f)
        }
        }.build()

        return _eiffelTower!!
    }

private var _eiffelTower: ImageVector? = null
