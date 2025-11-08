package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TransitionLeft: ImageVector
    get() {
        if (_transitionLeft != null) {
            return _transitionLeft!!
        }
        _transitionLeft = ImageVector.Builder(
            name = "TransitionLeft",
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
        moveTo(22f, 6f)
        curveTo(22f, 4.59987f, 22f, 3.8998f, 21.7275f, 3.36502f)
        curveTo(21.4878f, 2.89462f, 21.1054f, 2.51217f, 20.635f, 2.27248f)
        curveTo(20.1002f, 2f, 19.4001f, 2f, 18f, 2f)
        curveTo(16.5999f, 2f, 15.8998f, 2f, 15.365f, 2.27248f)
        curveTo(14.8946f, 2.51217f, 14.5122f, 2.89462f, 14.2725f, 3.36502f)
        curveTo(14f, 3.8998f, 14f, 4.59987f, 14f, 6f)
        verticalLineTo(18f)
        curveTo(14f, 19.4001f, 14f, 20.1002f, 14.2725f, 20.635f)
        curveTo(14.5122f, 21.1054f, 14.8946f, 21.4878f, 15.365f, 21.7275f)
        curveTo(15.8998f, 22f, 16.5999f, 22f, 18f, 22f)
        curveTo(19.4001f, 22f, 20.1002f, 22f, 20.635f, 21.7275f)
        curveTo(21.1054f, 21.4878f, 21.4878f, 21.1054f, 21.7275f, 20.635f)
        curveTo(22f, 20.1002f, 22f, 19.4001f, 22f, 18f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        horizontalLineTo(14f)
        moveTo(6f, 12f)
        curveTo(6f, 11.2998f, 7.9943f, 9.99153f, 8.5f, 9.5f)
        moveTo(6f, 12f)
        curveTo(6f, 12.7002f, 7.9943f, 14.0085f, 8.5f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 22f)
        curveTo(5.66111f, 22f, 4.49167f, 22f, 3.63789f, 21.4635f)
        curveTo(3.19267f, 21.1838f, 2.81621f, 20.8073f, 2.53647f, 20.3621f)
        curveTo(2f, 19.5083f, 2f, 18.3389f, 2f, 16f)
        verticalLineTo(8f)
        curveTo(2f, 5.66111f, 2f, 4.49167f, 2.53647f, 3.63789f)
        curveTo(2.81621f, 3.19267f, 3.19267f, 2.81621f, 3.63789f, 2.53647f)
        curveTo(4.49167f, 2f, 5.66111f, 2f, 8f, 2f)
        }
        }.build()

        return _transitionLeft!!
    }

private var _transitionLeft: ImageVector? = null
