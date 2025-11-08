package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TransitionRight: ImageVector
    get() {
        if (_transitionRight != null) {
            return _transitionRight!!
        }
        _transitionRight = ImageVector.Builder(
            name = "TransitionRight",
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
        moveTo(2f, 6f)
        curveTo(2f, 4.59987f, 2f, 3.8998f, 2.27248f, 3.36502f)
        curveTo(2.51217f, 2.89462f, 2.89462f, 2.51217f, 3.36502f, 2.27248f)
        curveTo(3.8998f, 2f, 4.59987f, 2f, 6f, 2f)
        curveTo(7.40013f, 2f, 8.1002f, 2f, 8.63498f, 2.27248f)
        curveTo(9.10538f, 2.51217f, 9.48783f, 2.89462f, 9.72752f, 3.36502f)
        curveTo(10f, 3.8998f, 10f, 4.59987f, 10f, 6f)
        verticalLineTo(18f)
        curveTo(10f, 19.4001f, 10f, 20.1002f, 9.72752f, 20.635f)
        curveTo(9.48783f, 21.1054f, 9.10538f, 21.4878f, 8.63498f, 21.7275f)
        curveTo(8.1002f, 22f, 7.40013f, 22f, 6f, 22f)
        curveTo(4.59987f, 22f, 3.8998f, 22f, 3.36502f, 21.7275f)
        curveTo(2.89462f, 21.4878f, 2.51217f, 21.1054f, 2.27248f, 20.635f)
        curveTo(2f, 20.1002f, 2f, 19.4001f, 2f, 18f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 22f)
        curveTo(18.3389f, 22f, 19.5083f, 22f, 20.3621f, 21.4635f)
        curveTo(20.8073f, 21.1838f, 21.1838f, 20.8073f, 21.4635f, 20.3621f)
        curveTo(22f, 19.5083f, 22f, 18.3389f, 22f, 16f)
        verticalLineTo(8f)
        curveTo(22f, 5.66111f, 22f, 4.49167f, 21.4635f, 3.63789f)
        curveTo(21.1838f, 3.19267f, 20.8073f, 2.81621f, 20.3621f, 2.53647f)
        curveTo(19.5083f, 2f, 18.3389f, 2f, 16f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12f)
        horizontalLineTo(10f)
        moveTo(18f, 12f)
        curveTo(18f, 11.2998f, 16.0057f, 9.99153f, 15.5f, 9.5f)
        moveTo(18f, 12f)
        curveTo(18f, 12.7002f, 16.0057f, 14.0085f, 15.5f, 14.5f)
        }
        }.build()

        return _transitionRight!!
    }

private var _transitionRight: ImageVector? = null
