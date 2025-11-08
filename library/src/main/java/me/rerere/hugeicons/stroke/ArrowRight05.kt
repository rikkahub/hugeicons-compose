package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowRight05: ImageVector
    get() {
        if (_arrowRight05 != null) {
            return _arrowRight05!!
        }
        _arrowRight05 = ImageVector.Builder(
            name = "ArrowRight05",
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
        moveTo(19.9999f, 6f)
        lineTo(19.9998f, 18.0007f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5028f, 12.0113f)
        verticalLineTo(12.3819f)
        curveTo(11.4622f, 15.353f, 11.5972f, 16.3852f, 12.8477f, 15.906f)
        lineTo(13.1558f, 15.7241f)
        lineTo(13.4044f, 15.5513f)
        lineTo(13.9396f, 15.1383f)
        lineTo(14.94f, 14.269f)
        lineTo(15.9629f, 13.4052f)
        lineTo(16.4629f, 12.9521f)
        lineTo(16.6855f, 12.7255f)
        lineTo(16.9477f, 12.3465f)
        lineTo(17.0015f, 12.0102f)
        lineTo(16.9477f, 11.6762f)
        lineTo(16.6855f, 11.2971f)
        lineTo(16.4629f, 11.0706f)
        lineTo(15.9629f, 10.6175f)
        lineTo(14.94f, 9.75372f)
        lineTo(13.9396f, 8.88439f)
        lineTo(13.4044f, 8.4714f)
        lineTo(13.1558f, 8.29862f)
        lineTo(12.8477f, 8.1167f)
        curveTo(11.5972f, 7.63748f, 11.4622f, 8.66971f, 11.5028f, 11.6408f)
        verticalLineTo(12.0113f)
        moveTo(11.5028f, 12.0113f)
        horizontalLineTo(3.99983f)
        }
        }.build()

        return _arrowRight05!!
    }

private var _arrowRight05: ImageVector? = null
