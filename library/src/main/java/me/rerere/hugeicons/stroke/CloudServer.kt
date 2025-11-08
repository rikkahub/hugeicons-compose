package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CloudServer: ImageVector
    get() {
        if (_cloudServer != null) {
            return _cloudServer!!
        }
        _cloudServer = ImageVector.Builder(
            name = "CloudServer",
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
        moveTo(17.4776f, 8.00005f)
        curveTo(17.485f, 8.00002f, 17.4925f, 8f, 17.5f, 8f)
        curveTo(19.9853f, 8f, 22f, 10.0147f, 22f, 12.5f)
        curveTo(22f, 14.9853f, 19.9853f, 17f, 17.5f, 17f)
        horizontalLineTo(7f)
        curveTo(4.23858f, 17f, 2f, 14.7614f, 2f, 12f)
        curveTo(2f, 9.40034f, 3.98398f, 7.26407f, 6.52042f, 7.0227f)
        moveTo(17.4776f, 8.00005f)
        curveTo(17.4924f, 7.83536f, 17.5f, 7.66856f, 17.5f, 7.5f)
        curveTo(17.5f, 4.46243f, 15.0376f, 2f, 12f, 2f)
        curveTo(9.12324f, 2f, 6.76233f, 4.20862f, 6.52042f, 7.0227f)
        moveTo(17.4776f, 8.00005f)
        curveTo(17.3753f, 9.1345f, 16.9286f, 10.1696f, 16.2428f, 11f)
        moveTo(6.52042f, 7.0227f)
        curveTo(6.67826f, 7.00768f, 6.83823f, 7f, 7f, 7f)
        curveTo(8.12582f, 7f, 9.16474f, 7.37209f, 10.0005f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 20.75f)
        verticalLineTo(20.5f)
        curveTo(14f, 19.9477f, 13.5523f, 19.5f, 13f, 19.5f)
        horizontalLineTo(12f)
        moveTo(14f, 20.75f)
        verticalLineTo(21f)
        curveTo(14f, 21.5523f, 13.5523f, 22f, 13f, 22f)
        horizontalLineTo(11f)
        curveTo(10.4477f, 22f, 10f, 21.5523f, 10f, 21f)
        verticalLineTo(20.75f)
        moveTo(14f, 20.75f)
        horizontalLineTo(19f)
        moveTo(10f, 20.75f)
        verticalLineTo(20.5f)
        curveTo(10f, 19.9477f, 10.4477f, 19.5f, 11f, 19.5f)
        horizontalLineTo(12f)
        moveTo(10f, 20.75f)
        horizontalLineTo(5f)
        moveTo(12f, 19.5f)
        verticalLineTo(17f)
        }
        }.build()

        return _cloudServer!!
    }

private var _cloudServer: ImageVector? = null
