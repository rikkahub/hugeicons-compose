package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CameraLens: ImageVector
    get() {
        if (_cameraLens != null) {
            return _cameraLens!!
        }
        _cameraLens = ImageVector.Builder(
            name = "CameraLens",
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
        moveTo(12f, 8f)
        horizontalLineTo(21f)
        moveTo(16f, 12f)
        verticalLineTo(21f)
        moveTo(8f, 12f)
        verticalLineTo(3f)
        moveTo(12f, 16f)
        horizontalLineTo(3f)
        }
        }.build()

        return _cameraLens!!
    }

private var _cameraLens: ImageVector? = null
