package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowMoveLeftDown: ImageVector
    get() {
        if (_arrowMoveLeftDown != null) {
            return _arrowMoveLeftDown!!
        }
        _arrowMoveLeftDown = ImageVector.Builder(
            name = "ArrowMoveLeftDown",
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
        moveTo(3f, 5f)
        horizontalLineTo(4f)
        curveTo(10.5997f, 5f, 13.8995f, 5f, 15.9497f, 7.12067f)
        curveTo(18f, 9.24133f, 18f, 12.6545f, 18f, 19.4808f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 2f)
        curveTo(5.39316f, 2.58984f, 3f, 4.15973f, 3f, 5f)
        curveTo(3f, 5.84027f, 5.39316f, 7.41016f, 6f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 19f)
        curveTo(15.5898f, 19.6068f, 17.1597f, 22f, 18f, 22f)
        curveTo(18.8403f, 22f, 20.4102f, 19.6068f, 21f, 19f)
        }
        }.build()

        return _arrowMoveLeftDown!!
    }

private var _arrowMoveLeftDown: ImageVector? = null
