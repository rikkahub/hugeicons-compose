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

val HugeIcons.SquareUserRound: ImageVector
    get() {
        if (_squareUserRound != null) {
            return _squareUserRound!!
        }
        _squareUserRound = ImageVector.Builder(
            name = "SquareUserRound",
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
            moveTo(11.4923f, 2.5f)
            lineTo(12.4923f, 2.50001f)
            curveTo(16.7349f, 2.50006f, 18.8562f, 2.50008f, 20.1742f, 3.8181f)
            curveTo(21.4922f, 5.13611f, 21.4922f, 7.25741f, 21.4922f, 11.5f)
            verticalLineTo(12.5001f)
            curveTo(21.4922f, 16.7427f, 21.4922f, 18.8641f, 20.1742f, 20.1821f)
            curveTo(18.8561f, 21.5001f, 16.7348f, 21.5001f, 12.4922f, 21.5001f)
            horizontalLineTo(11.4922f)
            curveTo(7.24955f, 21.5001f, 5.12823f, 21.5001f, 3.81021f, 20.1821f)
            curveTo(2.49219f, 18.8641f, 2.49219f, 16.7427f, 2.49219f, 12.5001f)
            verticalLineTo(11.5f)
            curveTo(2.49219f, 7.25732f, 2.49219f, 5.13598f, 3.81022f, 3.81795f)
            curveTo(5.12826f, 2.49993f, 7.2496f, 2.49995f, 11.4923f, 2.5f)
            close()
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
            moveTo(11.9922f, 7.39453f)
            curveTo(13.9252f, 7.39453f, 15.4922f, 8.96153f, 15.4922f, 10.8945f)
            curveTo(15.4922f, 12.8275f, 13.9252f, 14.3945f, 11.9922f, 14.3945f)
            curveTo(10.0592f, 14.3945f, 8.49219f, 12.8275f, 8.49219f, 10.8945f)
            curveTo(8.49219f, 8.96153f, 10.0592f, 7.39453f, 11.9922f, 7.39453f)
            close()
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
            moveTo(18.9726f, 20.8945f)
            curveTo(18.7163f, 17.2619f, 15.6881f, 14.3945f, 11.9902f, 14.3945f)
            curveTo(8.29235f, 14.3945f, 5.26419f, 17.2619f, 5.00781f, 20.8945f)
        }
        }.build()

        return _squareUserRound!!
    }

private var _squareUserRound: ImageVector? = null
