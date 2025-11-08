package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BirthdayCake: ImageVector
    get() {
        if (_birthdayCake != null) {
            return _birthdayCake!!
        }
        _birthdayCake = ImageVector.Builder(
            name = "BirthdayCake",
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
        moveTo(13.5f, 4.5f)
        curveTo(13.5f, 5.32843f, 12.8284f, 6f, 12f, 6f)
        curveTo(11.1716f, 6f, 10.5f, 5.32843f, 10.5f, 4.5f)
        curveTo(10.5f, 3.67157f, 12f, 2f, 12f, 2f)
        curveTo(12f, 2f, 13.5f, 3.67157f, 13.5f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6667f, 14f)
        curveTo(19.2315f, 14f, 20.5f, 12.8807f, 20.5f, 11.5f)
        curveTo(20.5f, 10.1193f, 19.2315f, 9f, 17.6667f, 9f)
        horizontalLineTo(6.33333f)
        curveTo(4.76853f, 9f, 3.5f, 10.1193f, 3.5f, 11.5f)
        curveTo(3.5f, 12.8807f, 4.76853f, 14f, 6.33333f, 14f)
        curveTo(7.70408f, 14f, 8.90415f, 13.1411f, 9.16667f, 12f)
        curveTo(9.42919f, 13.1411f, 10.6293f, 14f, 12f, 14f)
        curveTo(13.3707f, 14f, 14.5708f, 13.1411f, 14.8333f, 12f)
        curveTo(15.0959f, 13.1411f, 16.2959f, 14f, 17.6667f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 14f)
        lineTo(5.52089f, 16.5796f)
        curveTo(6.04532f, 19.1768f, 6.30754f, 20.4754f, 7.19608f, 21.2377f)
        curveTo(8.08462f, 22f, 9.33608f, 22f, 11.839f, 22f)
        horizontalLineTo(12.161f)
        curveTo(14.6639f, 22f, 15.9154f, 22f, 16.8039f, 21.2377f)
        curveTo(17.6925f, 20.4754f, 17.9547f, 19.1768f, 18.4791f, 16.5796f)
        lineTo(19f, 14f)
        }
        }.build()

        return _birthdayCake!!
    }

private var _birthdayCake: ImageVector? = null
