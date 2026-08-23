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

val HugeIcons.TowerControl: ImageVector
    get() {
        if (_towerControl != null) {
            return _towerControl!!
        }
        _towerControl = ImageVector.Builder(
            name = "TowerControl",
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
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3.30659f, 8.48499f)
            curveTo(3.00993f, 7.34109f, 2.8616f, 6.76914f, 3.17315f, 6.38457f)
            curveTo(3.4847f, 6f, 4.09638f, 6f, 5.31974f, 6f)
            horizontalLineTo(18.6802f)
            curveTo(19.9036f, 6f, 20.5153f, 6f, 20.8269f, 6.38459f)
            curveTo(21.1384f, 6.76918f, 20.9901f, 7.34114f, 20.6933f, 8.48507f)
            lineTo(20.0487f, 10.9701f)
            curveTo(19.6713f, 12.4253f, 19.4826f, 13.1528f, 18.9197f, 13.5764f)
            curveTo(18.3568f, 14f, 17.5787f, 14f, 16.0225f, 14f)
            horizontalLineTo(7.97735f)
            curveTo(6.42107f, 14f, 5.64293f, 14f, 5.08003f, 13.5764f)
            curveTo(4.51713f, 13.1528f, 4.32843f, 12.4252f, 3.95105f, 10.97f)
            lineTo(3.30659f, 8.48499f)
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
            moveTo(16f, 6f)
            lineTo(15f, 14f)
            moveTo(9f, 14f)
            lineTo(8f, 6f)
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
            moveTo(15f, 14f)
            verticalLineTo(22f)
            moveTo(9f, 14f)
            verticalLineTo(22f)
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
            moveTo(10f, 2f)
            horizontalLineTo(14f)
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
            moveTo(12f, 2f)
            verticalLineTo(6f)
        }
        }.build()

        return _towerControl!!
    }

private var _towerControl: ImageVector? = null
