package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GitFork: ImageVector
    get() {
        if (_gitFork != null) {
            return _gitFork!!
        }
        _gitFork = ImageVector.Builder(
            name = "GitFork",
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
        moveTo(6f, 8f)
        curveTo(7.10457f, 8f, 8f, 7.10457f, 8f, 6f)
        curveTo(8f, 4.89543f, 7.10457f, 4f, 6f, 4f)
        curveTo(4.89543f, 4f, 4f, 4.89543f, 4f, 6f)
        curveTo(4f, 7.10457f, 4.89543f, 8f, 6f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20f)
        curveTo(13.1046f, 20f, 14f, 19.1046f, 14f, 18f)
        curveTo(14f, 16.8954f, 13.1046f, 16f, 12f, 16f)
        curveTo(10.8954f, 16f, 10f, 16.8954f, 10f, 18f)
        curveTo(10f, 19.1046f, 10.8954f, 20f, 12f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8f)
        curveTo(19.1046f, 8f, 20f, 7.10457f, 20f, 6f)
        curveTo(20f, 4.89543f, 19.1046f, 4f, 18f, 4f)
        curveTo(16.8954f, 4f, 16f, 4.89543f, 16f, 6f)
        curveTo(16f, 7.10457f, 16.8954f, 8f, 18f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.01734f, 8.74067f)
        curveTo(6.01734f, 10.4142f, 5.77537f, 12.1995f, 9.22051f, 11.9855f)
        horizontalLineTo(12.0053f)
        moveTo(17.9929f, 8.57617f)
        curveTo(18.1259f, 11.9855f, 16.9199f, 11.7648f, 15.7861f, 11.9855f)
        horizontalLineTo(12.0053f)
        moveTo(12.0053f, 15.7001f)
        verticalLineTo(11.9855f)
        }
        }.build()

        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
