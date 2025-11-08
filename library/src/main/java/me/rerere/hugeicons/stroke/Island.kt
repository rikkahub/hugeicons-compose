package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Island: ImageVector
    get() {
        if (_island != null) {
            return _island!!
        }
        _island = ImageVector.Builder(
            name = "Island",
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
        moveTo(8f, 19f)
        curveTo(9.19765f, 16.6088f, 11.4362f, 15f, 14f, 15f)
        curveTo(16.5638f, 15f, 18.8023f, 16.6088f, 20f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15.1016f)
        curveTo(8f, 14.5448f, 5.39726f, 16.3366f, 4f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        curveTo(12f, 12f, 12.8f, 7.16f, 16f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5004f, 2f)
        curveTo(16.3755f, 2f, 17.3024f, 3.0972f, 16f, 5f)
        moveTo(16f, 5f)
        curveTo(16.7861f, 5.23357f, 19.208f, 6.31952f, 18.9828f, 9f)
        moveTo(16f, 5f)
        curveTo(15.4148f, 4.29569f, 13.3126f, 3.40012f, 12f, 4.80011f)
        moveTo(16f, 5f)
        curveTo(16.58f, 5.70922f, 17f, 8f, 16f, 9f)
        }
        }.build()

        return _island!!
    }

private var _island: ImageVector? = null
