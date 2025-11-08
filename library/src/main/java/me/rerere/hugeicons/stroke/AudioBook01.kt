package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AudioBook01: ImageVector
    get() {
        if (_audioBook01 != null) {
            return _audioBook01!!
        }
        _audioBook01 = ImageVector.Builder(
            name = "AudioBook01",
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
        moveTo(20f, 22f)
        horizontalLineTo(6f)
        curveTo(4.89543f, 22f, 4f, 21.1046f, 4f, 20f)
        moveTo(4f, 20f)
        curveTo(4f, 18.8954f, 4.89543f, 18f, 6f, 18f)
        horizontalLineTo(20f)
        verticalLineTo(6f)
        curveTo(20f, 4.11438f, 20f, 3.17157f, 19.4142f, 2.58579f)
        curveTo(18.8284f, 2f, 17.8856f, 2f, 16f, 2f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
        curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 18f)
        curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
        curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.576f, 9.235f)
        lineTo(11.189f, 7.11812f)
        curveTo(11.0655f, 7.04093f, 10.9228f, 7f, 10.7771f, 7f)
        curveTo(10.3479f, 7f, 10f, 7.34793f, 10f, 7.77712f)
        verticalLineTo(12.2229f)
        curveTo(10f, 12.6521f, 10.3479f, 13f, 10.7771f, 13f)
        curveTo(10.9228f, 13f, 11.0655f, 12.9591f, 11.189f, 12.8819f)
        lineTo(14.576f, 10.765f)
        curveTo(14.8398f, 10.6001f, 15f, 10.311f, 15f, 10f)
        curveTo(15f, 9.68896f, 14.8398f, 9.39985f, 14.576f, 9.235f)
        }
        }.build()

        return _audioBook01!!
    }

private var _audioBook01: ImageVector? = null
