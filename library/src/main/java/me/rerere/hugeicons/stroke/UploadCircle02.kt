package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UploadCircle02: ImageVector
    get() {
        if (_uploadCircle02 != null) {
            return _uploadCircle02!!
        }
        _uploadCircle02 = ImageVector.Builder(
            name = "UploadCircle02",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 10.5f)
        curveTo(15.5f, 10.5f, 12.9223f, 7.00001f, 12f, 7f)
        curveTo(11.0777f, 6.99999f, 8.5f, 10.5f, 8.5f, 10.5f)
        moveTo(12f, 7.5f)
        verticalLineTo(14f)
        moveTo(8.5f, 17f)
        horizontalLineTo(15.5f)
        }
        }.build()

        return _uploadCircle02!!
    }

private var _uploadCircle02: ImageVector? = null
