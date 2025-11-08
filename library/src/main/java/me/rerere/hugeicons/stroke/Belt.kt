package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Belt: ImageVector
    get() {
        if (_belt != null) {
            return _belt!!
        }
        _belt = ImageVector.Builder(
            name = "Belt",
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
        moveTo(8.9751f, 17.9655f)
        curveTo(12.4619f, 17.5232f, 16f, 16.3318f, 16f, 12f)
        curveTo(16f, 7.66817f, 12.4619f, 6.47683f, 8.9751f, 6.0345f)
        curveTo(6.62063f, 5.73582f, 6f, 7.41975f, 6f, 9.41154f)
        verticalLineTo(14.5885f)
        curveTo(6f, 16.5803f, 6.62063f, 18.2642f, 8.9751f, 17.9655f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7.5f)
        horizontalLineTo(6f)
        moveTo(2f, 16.5f)
        horizontalLineTo(6f)
        moveTo(14f, 7.5f)
        horizontalLineTo(22f)
        moveTo(14f, 16.5f)
        lineTo(22f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.9998f, 12f)
        horizontalLineTo(20.0088f)
        }
        }.build()

        return _belt!!
    }

private var _belt: ImageVector? = null
