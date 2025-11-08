package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiSheets: ImageVector
    get() {
        if (_aiSheets != null) {
            return _aiSheets!!
        }
        _aiSheets = ImageVector.Builder(
            name = "AiSheets",
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
        moveTo(12f, 21f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 21f, 4.34315f, 21f, 3.17157f, 19.8284f)
        curveTo(2f, 18.6569f, 2f, 16.7712f, 2f, 13f)
        verticalLineTo(11f)
        curveTo(2f, 7.22876f, 2f, 5.34315f, 3.17157f, 4.17157f)
        curveTo(4.34315f, 3f, 6.22876f, 3f, 10f, 3f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 3f, 19.6569f, 3f, 20.8284f, 4.17157f)
        curveTo(22f, 5.34315f, 22f, 7.22876f, 22f, 11f)
        verticalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 15f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5803f, 13.2673f)
        curveTo(17.7466f, 12.9109f, 18.2534f, 12.9109f, 18.4197f, 13.2673f)
        lineTo(19.0465f, 14.6104f)
        curveTo(19.3226f, 15.2019f, 19.7981f, 15.6774f, 20.3896f, 15.9535f)
        lineTo(21.7327f, 16.5803f)
        curveTo(22.0891f, 16.7466f, 22.0891f, 17.2534f, 21.7327f, 17.4197f)
        lineTo(20.3896f, 18.0465f)
        curveTo(19.7981f, 18.3226f, 19.3226f, 18.7981f, 19.0465f, 19.3896f)
        lineTo(18.4197f, 20.7327f)
        curveTo(18.2534f, 21.0891f, 17.7466f, 21.0891f, 17.5803f, 20.7327f)
        lineTo(16.9535f, 19.3896f)
        curveTo(16.6774f, 18.7981f, 16.2019f, 18.3226f, 15.6104f, 18.0465f)
        lineTo(14.2673f, 17.4197f)
        curveTo(13.9109f, 17.2534f, 13.9109f, 16.7466f, 14.2673f, 16.5803f)
        lineTo(15.6104f, 15.9535f)
        curveTo(16.2019f, 15.6774f, 16.6774f, 15.2019f, 16.9535f, 14.6104f)
        lineTo(17.5803f, 13.2673f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 3f)
        verticalLineTo(21f)
        }
        }.build()

        return _aiSheets!!
    }

private var _aiSheets: ImageVector? = null
