package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Lake: ImageVector
    get() {
        if (_lake != null) {
            return _lake!!
        }
        _lake = ImageVector.Builder(
            name = "Lake",
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
        moveTo(2f, 21.9684f)
        curveTo(2.94975f, 21.9684f, 3.88858f, 22.0553f, 4.67843f, 21.4396f)
        curveTo(5.45232f, 20.8365f, 6.68304f, 20.8564f, 7.42654f, 21.4842f)
        curveTo(8.2373f, 22.1688f, 9.76776f, 22.1494f, 10.5969f, 21.5032f)
        curveTo(11.4013f, 20.8763f, 12.6209f, 20.804f, 13.4265f, 21.4842f)
        curveTo(14.3106f, 22.2306f, 15.8003f, 22.1241f, 16.6784f, 21.4396f)
        curveTo(17.4523f, 20.8365f, 18.683f, 20.8564f, 19.4265f, 21.4842f)
        curveTo(20.1427f, 22.0889f, 21.1197f, 21.9684f, 22f, 21.9684f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17.9684f)
        curveTo(2.94975f, 17.9684f, 3.88858f, 18.0553f, 4.67843f, 17.4396f)
        curveTo(5.45232f, 16.8365f, 6.68304f, 16.8564f, 7.42654f, 17.4842f)
        curveTo(8.2373f, 18.1688f, 9.76776f, 18.1494f, 10.5969f, 17.5032f)
        curveTo(11.4013f, 16.8763f, 12.6209f, 16.804f, 13.4265f, 17.4842f)
        curveTo(14.3106f, 18.2306f, 15.8003f, 18.1241f, 16.6784f, 17.4396f)
        curveTo(17.4523f, 16.8365f, 18.683f, 16.8564f, 19.4265f, 17.4842f)
        curveTo(20.1427f, 18.0889f, 21.1197f, 17.9684f, 22f, 17.9684f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 14f)
        verticalLineTo(3f)
        moveTo(6f, 3f)
        curveTo(5.75f, 3.66667f, 4.8f, 5.5f, 3f, 5.5f)
        moveTo(6f, 3f)
        curveTo(6.25f, 3.66667f, 7.2f, 5.5f, 9f, 5.5f)
        moveTo(3f, 8.5f)
        curveTo(4.8f, 8.5f, 5.75f, 6.66667f, 6f, 6f)
        curveTo(6.25f, 6.66667f, 7.2f, 8.5f, 9f, 8.5f)
        }
        }.build()

        return _lake!!
    }

private var _lake: ImageVector? = null
