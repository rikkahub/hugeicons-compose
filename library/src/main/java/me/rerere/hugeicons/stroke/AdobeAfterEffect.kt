package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AdobeAfterEffect: ImageVector
    get() {
        if (_adobeAfterEffect != null) {
            return _adobeAfterEffect!!
        }
        _adobeAfterEffect = ImageVector.Builder(
            name = "AdobeAfterEffect",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        lineTo(11.1339f, 13.2f)
        moveTo(6f, 16f)
        lineTo(6.86614f, 13.2f)
        moveTo(6.86614f, 13.2f)
        lineTo(7.59031f, 10.8589f)
        curveTo(8.17989f, 8.95298f, 8.47468f, 8f, 9f, 8f)
        curveTo(9.52532f, 8f, 9.82011f, 8.95298f, 10.4097f, 10.8589f)
        lineTo(11.1339f, 13.2f)
        moveTo(6.86614f, 13.2f)
        horizontalLineTo(11.1339f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 12.8696f)
        verticalLineTo(14f)
        curveTo(14f, 15.1046f, 14.8954f, 16f, 16f, 16f)
        curveTo(16.7429f, 16f, 17.3912f, 15.5949f, 17.7361f, 14.9936f)
        moveTo(14f, 12.8696f)
        verticalLineTo(12f)
        curveTo(14f, 10.8954f, 14.8954f, 10f, 16f, 10f)
        curveTo(17.1046f, 10f, 18f, 10.8954f, 18f, 12f)
        lineTo(18f, 12.8696f)
        horizontalLineTo(14f)
        }
        }.build()

        return _adobeAfterEffect!!
    }

private var _adobeAfterEffect: ImageVector? = null
