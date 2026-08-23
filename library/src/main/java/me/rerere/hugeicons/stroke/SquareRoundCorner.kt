package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareRoundCorner: ImageVector
    get() {
        if (_squareRoundCorner != null) {
            return _squareRoundCorner!!
        }
        _squareRoundCorner = ImageVector.Builder(
            name = "SquareRoundCorner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 15f)
            curveTo(21f, 17.3389f, 21f, 18.5083f, 20.4635f, 19.3621f)
            curveTo(20.1838f, 19.8073f, 19.8073f, 20.1838f, 19.3621f, 20.4635f)
            curveTo(18.5083f, 21f, 17.3389f, 21f, 15f, 21f)
            horizontalLineTo(10f)
            curveTo(6.70017f, 21f, 5.05025f, 21f, 4.02513f, 19.9749f)
            curveTo(3f, 18.9497f, 3f, 17.2998f, 3f, 14f)
            verticalLineTo(9f)
            curveTo(3f, 6.66111f, 3f, 5.49167f, 3.53647f, 4.63789f)
            curveTo(3.81621f, 4.19267f, 4.19267f, 3.81621f, 4.63789f, 3.53647f)
            curveTo(5.49167f, 3f, 6.66111f, 3f, 9f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 11f)
            curveTo(20.7376f, 8.33208f, 20.1445f, 6.53625f, 18.8041f, 5.19588f)
            curveTo(17.4638f, 3.8555f, 15.6679f, 3.26242f, 13f, 3f)
        }
        }.build()

        return _squareRoundCorner!!
    }

private var _squareRoundCorner: ImageVector? = null
