package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowMoveRightDown: ImageVector
    get() {
        if (_arrowMoveRightDown != null) {
            return _arrowMoveRightDown!!
        }
        _arrowMoveRightDown = ImageVector.Builder(
            name = "ArrowMoveRightDown",
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
        moveTo(20f, 5f)
        horizontalLineTo(19.0667f)
        curveTo(12.907f, 5f, 9.82714f, 5f, 7.91357f, 7.12067f)
        curveTo(6f, 9.24133f, 6f, 12.6545f, 6f, 19.4808f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 2f)
        curveTo(18.6068f, 2.58984f, 21f, 4.15973f, 21f, 5f)
        curveTo(21f, 5.84027f, 18.6068f, 7.41016f, 18f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 19f)
        curveTo(8.41016f, 19.6068f, 6.84027f, 22f, 6f, 22f)
        curveTo(5.15973f, 22f, 3.58984f, 19.6068f, 3f, 19f)
        }
        }.build()

        return _arrowMoveRightDown!!
    }

private var _arrowMoveRightDown: ImageVector? = null
