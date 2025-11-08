package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PackageMoving: ImageVector
    get() {
        if (_packageMoving != null) {
            return _packageMoving!!
        }
        _packageMoving = ImageVector.Builder(
            name = "PackageMoving",
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
        moveTo(13f, 22f)
        curveTo(12.1818f, 22f, 11.4002f, 21.6588f, 9.83691f, 20.9764f)
        curveTo(8.01233f, 20.18f, 6.61554f, 19.5703f, 5.64648f, 19f)
        horizontalLineTo(2f)
        moveTo(13f, 22f)
        curveTo(13.8182f, 22f, 14.5998f, 21.6588f, 16.1631f, 20.9764f)
        curveTo(20.0544f, 19.2779f, 22f, 18.4286f, 22f, 17f)
        verticalLineTo(6.5f)
        moveTo(13f, 22f)
        lineTo(13f, 11f)
        moveTo(4f, 6.5f)
        lineTo(4f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.32592f, 9.69138f)
        lineTo(6.40472f, 8.27785f)
        curveTo(4.80157f, 7.5021f, 4f, 7.11423f, 4f, 6.5f)
        curveTo(4f, 5.88577f, 4.80157f, 5.4979f, 6.40472f, 4.72215f)
        lineTo(9.32592f, 3.30862f)
        curveTo(11.1288f, 2.43621f, 12.0303f, 2f, 13f, 2f)
        curveTo(13.9697f, 2f, 14.8712f, 2.4362f, 16.6741f, 3.30862f)
        lineTo(19.5953f, 4.72215f)
        curveTo(21.1984f, 5.4979f, 22f, 5.88577f, 22f, 6.5f)
        curveTo(22f, 7.11423f, 21.1984f, 7.5021f, 19.5953f, 8.27785f)
        lineTo(16.6741f, 9.69138f)
        curveTo(14.8712f, 10.5638f, 13.9697f, 11f, 13f, 11f)
        curveTo(12.0303f, 11f, 11.1288f, 10.5638f, 9.32592f, 9.69138f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.1366f, 4.01563f)
        lineTo(7.86719f, 8.98485f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 13f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 16f)
        horizontalLineTo(5f)
        }
        }.build()

        return _packageMoving!!
    }

private var _packageMoving: ImageVector? = null
