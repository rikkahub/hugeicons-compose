package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BedSingle02: ImageVector
    get() {
        if (_bedSingle02 != null) {
            return _bedSingle02!!
        }
        _bedSingle02 = ImageVector.Builder(
            name = "BedSingle02",
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
        moveTo(22f, 17.5f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 21f)
        verticalLineTo(16f)
        curveTo(22f, 14.1144f, 22f, 13.1716f, 21.4142f, 12.5858f)
        curveTo(20.8284f, 12f, 19.8856f, 12f, 18f, 12f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 12f, 3.17157f, 12f, 2.58579f, 12.5858f)
        curveTo(2f, 13.1716f, 2f, 14.1144f, 2f, 16f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12f)
        verticalLineTo(10.6178f)
        curveTo(16f, 10.1103f, 15.9085f, 9.94054f, 15.4396f, 9.7405f)
        curveTo(14.4631f, 9.32389f, 13.2778f, 9f, 12f, 9f)
        curveTo(10.7222f, 9f, 9.53688f, 9.32389f, 8.5604f, 9.7405f)
        curveTo(8.09154f, 9.94054f, 8f, 10.1103f, 8f, 10.6178f)
        lineTo(8f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        verticalLineTo(9f)
        curveTo(3f, 7.58579f, 3f, 6.87868f, 3.43934f, 6.43934f)
        curveTo(3.87868f, 6f, 4.58579f, 6f, 6f, 6f)
        curveTo(6.27475f, 6f, 6.65685f, 6.07272f, 6.90282f, 5.94012f)
        curveTo(7.0139f, 5.88025f, 7.11349f, 5.72888f, 7.31269f, 5.42616f)
        curveTo(8.26921f, 3.97247f, 10.2246f, 3f, 12f, 3f)
        curveTo(13.7754f, 3f, 15.7308f, 3.97247f, 16.6873f, 5.42616f)
        curveTo(16.8865f, 5.72888f, 16.9861f, 5.88025f, 17.0972f, 5.94012f)
        curveTo(17.3432f, 6.07272f, 17.7252f, 6f, 18f, 6f)
        curveTo(19.4142f, 6f, 20.1213f, 6f, 20.5607f, 6.43934f)
        curveTo(21f, 6.87868f, 21f, 7.58579f, 21f, 9f)
        verticalLineTo(12f)
        }
        }.build()

        return _bedSingle02!!
    }

private var _bedSingle02: ImageVector? = null
