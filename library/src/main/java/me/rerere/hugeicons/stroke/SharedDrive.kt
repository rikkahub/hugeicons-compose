package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SharedDrive: ImageVector
    get() {
        if (_sharedDrive != null) {
            return _sharedDrive!!
        }
        _sharedDrive = ImageVector.Builder(
            name = "SharedDrive",
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
        moveTo(18f, 18f)
        horizontalLineTo(6f)
        curveTo(4.89543f, 18f, 4f, 18.8954f, 4f, 20f)
        curveTo(4f, 21.1046f, 4.89543f, 22f, 6f, 22f)
        lineTo(18f, 22f)
        curveTo(19.1046f, 22f, 20f, 21.1046f, 20f, 20f)
        curveTo(20f, 18.8954f, 19.1046f, 18f, 18f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 8.5f)
        curveTo(10.0523f, 8.5f, 10.5f, 8.05228f, 10.5f, 7.5f)
        curveTo(10.5f, 6.94772f, 10.0523f, 6.5f, 9.5f, 6.5f)
        moveTo(9.5f, 8.5f)
        curveTo(8.94772f, 8.5f, 8.5f, 8.05228f, 8.5f, 7.5f)
        curveTo(8.5f, 6.94772f, 8.94772f, 6.5f, 9.5f, 6.5f)
        moveTo(9.5f, 8.5f)
        verticalLineTo(6.5f)
        moveTo(8f, 12.5f)
        horizontalLineTo(11f)
        moveTo(7f, 13.5f)
        verticalLineTo(13f)
        curveTo(7f, 11.8954f, 7.89543f, 11f, 9f, 11f)
        horizontalLineTo(10f)
        curveTo(11.1046f, 11f, 12f, 11.8954f, 12f, 13f)
        verticalLineTo(13.5f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 8.5f)
        curveTo(15.0523f, 8.5f, 15.5f, 8.05228f, 15.5f, 7.5f)
        curveTo(15.5f, 6.94772f, 15.0523f, 6.5f, 14.5f, 6.5f)
        moveTo(14.5f, 8.5f)
        curveTo(13.9477f, 8.5f, 13.5f, 8.05228f, 13.5f, 7.5f)
        curveTo(13.5f, 6.94772f, 13.9477f, 6.5f, 14.5f, 6.5f)
        moveTo(14.5f, 8.5f)
        verticalLineTo(6.5f)
        moveTo(14.5f, 12.5f)
        horizontalLineTo(16f)
        moveTo(14.5f, 13.5f)
        horizontalLineTo(17f)
        verticalLineTo(13f)
        curveTo(17f, 11.8954f, 16.1046f, 11f, 15f, 11f)
        horizontalLineTo(14.5f)
        verticalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 20f)
        verticalLineTo(20.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 20f)
        verticalLineTo(20.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 20f)
        verticalLineTo(8f)
        curveTo(20f, 5.17157f, 20f, 3.75736f, 19.1213f, 2.87868f)
        curveTo(18.2426f, 2f, 16.8284f, 2f, 14f, 2f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
        curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
        verticalLineTo(20f)
        }
        }.build()

        return _sharedDrive!!
    }

private var _sharedDrive: ImageVector? = null
