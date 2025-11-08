package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stethoscope02: ImageVector
    get() {
        if (_stethoscope02 != null) {
            return _stethoscope02!!
        }
        _stethoscope02 = ImageVector.Builder(
            name = "Stethoscope02",
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
        moveTo(6.5f, 3.5f)
        horizontalLineTo(4.5f)
        curveTo(3.94772f, 3.5f, 3.5f, 3.94772f, 3.5f, 4.5f)
        verticalLineTo(8f)
        curveTo(3.5f, 11.0376f, 5.96243f, 13.5f, 9f, 13.5f)
        curveTo(12.0376f, 13.5f, 14.5f, 11.0376f, 14.5f, 8f)
        verticalLineTo(4.5f)
        curveTo(14.5f, 3.94772f, 14.0523f, 3.5f, 13.5f, 3.5f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 15.5f)
        verticalLineTo(16.75f)
        curveTo(18.5f, 19.3734f, 16.3734f, 21.5f, 13.75f, 21.5f)
        curveTo(11.1266f, 21.5f, 9f, 19.3734f, 9f, 16.75f)
        verticalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 2.5f)
        verticalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 2.5f)
        verticalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 13.5f)
        curveTo(20.5f, 14.6046f, 19.6046f, 15.5f, 18.5f, 15.5f)
        curveTo(17.3954f, 15.5f, 16.5f, 14.6046f, 16.5f, 13.5f)
        curveTo(16.5f, 12.3954f, 17.3954f, 11.5f, 18.5f, 11.5f)
        curveTo(19.6046f, 11.5f, 20.5f, 12.3954f, 20.5f, 13.5f)
        }
        }.build()

        return _stethoscope02!!
    }

private var _stethoscope02: ImageVector? = null
