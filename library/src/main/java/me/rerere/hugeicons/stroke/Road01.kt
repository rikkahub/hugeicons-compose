package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Road01: ImageVector
    get() {
        if (_road01 != null) {
            return _road01!!
        }
        _road01 = ImageVector.Builder(
            name = "Road01",
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
        moveTo(5.17157f, 3.17148f)
        curveTo(4f, 4.34305f, 4f, 6.22867f, 4f, 9.99991f)
        lineTo(4f, 13.9999f)
        curveTo(4f, 17.7711f, 4f, 19.6568f, 5.17157f, 20.8283f)
        moveTo(5.17157f, 3.17148f)
        curveTo(6.34315f, 1.99991f, 8.22876f, 1.99991f, 12f, 1.99991f)
        curveTo(15.7712f, 1.99991f, 17.6569f, 1.99991f, 18.8284f, 3.17148f)
        moveTo(5.17157f, 3.17148f)
        curveTo(5.17157f, 3.17148f, 5.17157f, 3.17148f, 5.17157f, 3.17148f)
        moveTo(5.17157f, 20.8283f)
        curveTo(6.34315f, 21.9999f, 8.22876f, 21.9999f, 12f, 21.9999f)
        curveTo(15.7712f, 21.9999f, 17.6569f, 21.9999f, 18.8284f, 20.8283f)
        moveTo(5.17157f, 20.8283f)
        curveTo(5.17157f, 20.8283f, 5.17157f, 20.8283f, 5.17157f, 20.8283f)
        moveTo(18.8284f, 20.8283f)
        curveTo(20f, 19.6568f, 20f, 17.7711f, 20f, 13.9999f)
        lineTo(20f, 9.99991f)
        curveTo(20f, 6.22867f, 20f, 4.34305f, 18.8284f, 3.17148f)
        moveTo(18.8284f, 20.8283f)
        curveTo(18.8284f, 20.8283f, 18.8284f, 20.8283f, 18.8284f, 20.8283f)
        moveTo(18.8284f, 3.17148f)
        curveTo(18.8284f, 3.17148f, 18.8284f, 3.17148f, 18.8284f, 3.17148f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10.9999f)
        lineTo(12f, 12.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5.49991f)
        lineTo(12f, 7.49991f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16.4999f)
        lineTo(12f, 18.4999f)
        }
        }.build()

        return _road01!!
    }

private var _road01: ImageVector? = null
